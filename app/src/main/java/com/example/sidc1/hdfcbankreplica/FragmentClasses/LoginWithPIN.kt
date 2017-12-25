package com.example.sidc1.hdfcbankreplica.FragmentClasses

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.sidc1.hdfcbankreplica.R

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [LoginWithPIN.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [LoginWithPIN.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginWithPIN() : Fragment(), Parcelable {

    @SuppressLint("ValidFragment")
    constructor(parcel: Parcel) : this() {
    }

    @Nullable
    override fun onCreateView(inflater: LayoutInflater?, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {

        return inflater!!.inflate(R.layout.fragment_login_with_pin, container, false)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<LoginWithPIN> {
        override fun createFromParcel(parcel: Parcel): LoginWithPIN {
            return LoginWithPIN(parcel)
        }

        override fun newArray(size: Int): Array<LoginWithPIN?> {
            return arrayOfNulls(size)
        }
    }
}