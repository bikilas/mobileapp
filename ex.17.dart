import 'dart:async';
import 'dart:io';
import 'package:async/async.dart';
import 'package:http/http.dart' as http;

Future<void> downloadFile(String url, String savePath) async {
  final response = await http.get(Uri.parse(url));
  final file = File(savePath);
  await file.writeAsBytes(response.bodyBytes);
}

Future<void> main() async {
  final downloads = [
    {
      'url': 'https://example.com/file1.txt',
      'savePath': 'path/to/save/file1.txt',
    },
    {
      'url': 'https://example.com/file2.txt',
      'savePath': 'path/to/save/file2.txt',
    },
    // Add more files to download
  ];

  final futures = downloads
      .map((download) => downloadFile(download['url'], download['savePath']))
      .toList();

  final progressStream = StreamGroup.merge(futures.map(
      (future) => future.asStream().transform(Progress<double>((count, total) {
            if (total == -1) {
              print('Downloading...');
            } else {
              final percentage = (count / total * 100).toStringAsFixed(2);
              print('Progress: $percentage%');
            }
          }))));

  try {
    await Future.wait(futures);
    print('All files downloaded successfully!');
  } catch (e) {
    print('Error occurred during file download: $e');
  } finally {
    await progressStream.drain();
  }
}
