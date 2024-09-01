package com.sip.ocp17.day19Complement;

public sealed interface Shape
permits Circle, Rectangle, Square {
double area();
}
