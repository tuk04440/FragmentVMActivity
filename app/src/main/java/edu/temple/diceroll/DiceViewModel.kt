package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    private val currentRoll = MutableLiveData<Int>()

    fun setRoll(roll: Int){
        currentRoll.value = roll
    }

    fun getRoll() : LiveData<Int>{
        return currentRoll
    }
}