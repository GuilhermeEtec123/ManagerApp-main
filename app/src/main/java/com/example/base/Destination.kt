package com.example.base

open class Destination(val route: String) {
    object homePage : Destination("homePage");
    object registerStudent : Destination("registerStudent");
    object registerCourse : Destination("registerCourse");
}