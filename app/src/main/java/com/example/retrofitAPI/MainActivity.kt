package com.example.retrofitAPI

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private var mAPIService: APIService? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAPIService = ApiUtils.apiService

        bt_add_user.setOnClickListener{
            Log.i("TEst","TEst")
            sendPost("TEST_POST","TEST")
        }
    }

    private fun sendPost(title: String, body: String) {
        mAPIService?.savePost(title, body)?.enqueue(object : Callback<Model> {
            override fun onResponse(call: Call<Model>, response: Response<Model>) {

                if (response.isSuccessful) {
//                    showResponse(response.body().toString())
                    Log.i(
                        "AA_",
                        "post submitted to API." + response.body().toString()
                    )
                }
            }

            override fun onFailure(call: Call<Model>, t: Throwable) {
                Log.e("AA_", "Unable to submit post to API.")
            }
        })
    }

}
