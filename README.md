# Calculator
Kotlin practice, make a calculator in MVVM.  
Make a calculator with "ViewModel" and "LiveData".  

<img src="https://github.com/stephenKD/Calculator/blob/master/app/src/main/res/drawable/sample_pic.png?raw=true" width=20% height=20%/>



## Step 1
Add viewBinding in "build.gradle".
```
android {
  buildFeatures{
      viewBinding true
  }
}
```

## Step 2
Add libs in "build.gradle" .
```
dependencies {
  //Retrofit2
  def lifecycle_version = "2.3.1"
  // ViewModel
  implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
  // LiveData
  implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
}

```

## Step 3
Start practice.

