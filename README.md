# AnimatedFloatingButton
轻量级可扩展带简单动画的 Material 悬浮按钮，需依赖 Material库
## 简介

- Material扩展控件
- 实现几种常用动画效果
- 支持自由扩展动画

## 集成
[![](https://jitpack.io/v/DMingOu/AnimatedFloatingButton.svg)](https://jitpack.io/#DMingOu/AnimatedFloatingButton)

- ### 添加jitpack库

```java
// build.gradle(Project:)
allprojects {
    repositories {
        ...
            maven { url 'https://www.jitpack.io' }
    }
}
```

- ### 添加依赖

  [点击查看最新版本号](https://github.com/DMingOu/AnimatedFloatingButton/releases)
```groovy
// build.gradle(Module:)
dependencies {
    implementation 'com.github.DMingOu:AnimatedFloatingButton:0.1.0'
}
```
## Gif
![1sOLcj.gif](https://s2.ax1x.com/2020/02/05/1sOLcj.gif)
## 使用方法
十分简单，一行代码即可开启悬浮按钮出场与隐藏动画
```java
setAnimationType(AnimatedFloatingButton.AnimationType type);
//AnimationType.NONE                 默认无动画       
//AnimationType.SCALE                缩小隐藏放大出场  
//AnimationType.TRANSLATION_UP_DOWN  平移,向上隐藏，向下出场 
//AnimationType.TRANSLATION_DOWN_UP  平移,向下隐藏，向上出场
```
基于`Material FloatingActionButton`使用方法与`FloatingActionButton`几乎相同，详情建议参考 [sample](https://github.com/DMingOu/AnimatedFloatingButton/blob/master/app/src/main/java/qg/odm/animatedfloatingbuttondemo/MainActivity.kt) 

