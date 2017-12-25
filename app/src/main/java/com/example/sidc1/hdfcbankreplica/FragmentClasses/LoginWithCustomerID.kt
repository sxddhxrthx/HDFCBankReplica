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

@SuppressLint("ParcelCreator")
/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [LoginWithCustomerID.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [LoginWithCustomerID.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginWithCustomerID() : Fragment(), Parcelable {

    @SuppressLint("ValidFragment")
    constructor(parcel: Parcel) : this() {
    }

    @Nullable
    override fun onCreateView(inflater: LayoutInflater?, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {

        return inflater!!.inflate(R.layout.fragment_login_with_customer_id, container, false)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<LoginWithCustomerID> {
        override fun createFromParcel(parcel: Parcel): LoginWithCustomerID {
            return LoginWithCustomerID(parcel)
        }

        override fun newArray(size: Int): Array<LoginWithCustomerID?> {
            return arrayOfNulls(size)
        }
    }
}