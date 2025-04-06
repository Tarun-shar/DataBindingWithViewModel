1) for set data on extview directly from viewmodel using data binding use->
      <TextView
            android:id="@+id/tvName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@{dataViewModel.nameLiveData}"  // use it
            android:textColor="@color/black"
            android:textSize="32sp"
            android:textStyle="bold" />


2) call any function onbtn click from viewmodel use ->
     <Button
            android:id="@+id/clickBtn"
            android:onClick="@{()-> dataViewModel.updateLiveData()}"  // use it
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="20dp"
            android:text="Click"
            android:textSize="24sp" />

3) two side data binding like we can also update livedata from view end then use->
        <EditText
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@={dataViewModel.nameLiveData}"  // use it
            android:textColor="#3F51B5"
            android:textSize="32sp"
            android:textStyle="bold"
            android:layout_marginBottom="10dp"/>
