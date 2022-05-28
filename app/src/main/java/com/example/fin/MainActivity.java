<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

<EditText
        android:id="@+id/IdUsername"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:autofillHints=""
                android:ems="10"
                android:hint="@string/username"
                android:inputType="textPersonName"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintVertical_bias="0.113" />

<Button
        android:id="@+id/idRegister"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="@string/register"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.829"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintVertical_bias="0.446" />

<Button
        android:id="@+id/idLogin"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="@string/login"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.191"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintVertical_bias="0.446" />

<TextView
        android:id="@+id/IdInfo"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="@string/toleransi_jumlah_kesalahan"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintVertical_bias="0.314" />

<EditText
        android:id="@+id/IdPasswd"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:autofillHints=""
                android:ems="10"
                android:hint="@string/password"
                android:inputType="textPassword"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintVertical_bias="0.217" />
</androidx.constraintlayout.widget.ConstraintLayout>