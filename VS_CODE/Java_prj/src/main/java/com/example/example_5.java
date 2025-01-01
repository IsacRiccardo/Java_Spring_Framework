// package com.example;

// import org.springframework.beans.factory.BeanFactory;
// import org.springframework.beans.factory.xml.XmlBeanFactory;
// import org.springframework.core.io.FileSystemResource;

// class Rectangle {
//     private int length;
//     private int width;

//     public void area() {
//         System.out.println("Rectangle area is "+(length*width));
//     }

//     public int getLength() { return length; }

//     public void setLength(int length) {
//         this.length = length;
//     }

//     public int getWidth() { return width; }

//     public void setWidth(int width) {
//         this.width = width;
//     }
// }

// class MainApp{
//     public static void main(String []args)
//     {
//         BeanFactory factory=new XmlBeanFactory(new FileSystemResource("C:\\Users\\ricoi\\OneDrive - Universitatea Politehnica Timisoara\\Master\\An2\\Sem1\\JAVA\\Project_2\\VS_CODE\\project_2_java\\src\\main\\resources\\Beans_example.xml"));
//         Rectangle r=(Rectangle)factory.getBean("rectangle");
//         r.area();
//     }
// }
