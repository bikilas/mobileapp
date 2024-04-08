import 'package:flutter/material.dart';

void main() {
  runApp(CourseApp());
}

class Course {
  String code;
  String title;
  String description;

  Course({
    required this.code,
    required this.title,
    this.description = "",
  });
}

class CoursesListScreen extends StatelessWidget {
  const CoursesListScreen({
    Key? key,
    required this.courses,
    required this.onTapped,
  }) : super(key: key);

  final List<Course> courses;
  final ValueChanged<Course> onTapped;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
          backgroundColor: Colors.green, title: const Text("Courses List")),
      body: ListView(
        children: [
          for (var course in courses)
            ListTile(
              title: Text(course.title),
              subtitle: Text(course.code),
              onTap: () => onTapped(course),
            ),
        ],
      ),
    );
  }
}

class CourseDetailsScreen extends StatelessWidget {
  final Course course;

  const CourseDetailsScreen({Key? key, required this.course}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.green, // Setting background color of the title
        title: Text(
          course.title,
          style: TextStyle(
              color: Color.fromARGB(
                  255, 243, 247, 243)), // Setting text color of the title
        ),
        centerTitle: true, // Centering the title
      ),
      body: Center(
        child: Column(
          children: [
            Text(course.title),
            Text(course.code),
            Text(course.description),
          ],
        ),
      ),
    );
  }
}

class CourseApp extends StatefulWidget {
  @override
  _CourseAppState createState() => _CourseAppState();
}

class _CourseAppState extends State<CourseApp> {
  Course? _selectedCourse;

  List<Course> courses = [
    Course(
      code: "SiTE-001",
      title: "Introduction To Programming",
      description: "Computer Organization, Architecture, Programming",
    ),
    Course(
      code: "SiTE-003",
      title: "Introduction to mobile Application",
      description: "Mobile contain widget,material app and other",
    ),
    Course(
      code: "SiTE-004",
      title: "Introduction To AI",
      description:
          "AI is the high level part of human being that can develop by skilal",
    ),
    // Add more courses here if needed
  ];

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Course App',
      home: Navigator(
        pages: [
          MaterialPage(
            key: const ValueKey('CoursesListScreen'),
            child: CoursesListScreen(
              courses: courses,
              onTapped: _tabHandler,
            ),
          ),
          if (_selectedCourse != null)
            MaterialPage(
              key: ValueKey(_selectedCourse),
              child: CourseDetailsScreen(course: _selectedCourse!),
            ),
        ],
        onPopPage: (route, result) {
          if (!route.didPop(result)) {
            return false;
          }
          setState(() {
            _selectedCourse = null;
          });
          return true;
        },
      ),
    );
  }

  void _tabHandler(Course course) {
    setState(() {
      _selectedCourse = course;
    });
  }
}
