package com.akshayashokcode.bluetoothchat.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.akshayashokcode.bluetoothchat.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain() : BluetoothDeviceDomain{
    return BluetoothDeviceDomain(
        name = this.name,
        address = this.address
    )
}