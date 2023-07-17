package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class ActivitiesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activities, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_activities:WebView = view.findViewById(R.id.web_activities)
        web_activities.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_activities.loadUrl("https://nsangisecondaryschool.com/activities.html")
        web_activities.settings.javaScriptEnabled = true
        web_activities.settings.useWideViewPort = true
        web_activities.settings.allowContentAccess = true
        web_activities.settings.domStorageEnabled = true
    }
}