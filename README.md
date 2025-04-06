1) for set data on extview directly from viewmodel using data binding use->
      <TextView
            android:text="@{dataViewModel.nameLiveData}"  // use it
            />


2) call any function onbtn click from viewmodel use ->
     <Button
            android:onClick="@{()-> dataViewModel.updateLiveData()}"  // use it
          />

4) two side data binding like we can also update livedata from view end then use->
        <EditText
            android:text="@={dataViewModel.nameLiveData}"  // use it
            />
