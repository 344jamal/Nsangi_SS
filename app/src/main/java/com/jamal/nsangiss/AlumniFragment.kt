package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class AlumniFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alumni, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_alumni:WebView = view.findViewById(R.id.web_alumni)
        web_alumni.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url:String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_alumni.loadUrl("https://nsangisecondaryschool.com/ob.html")
        web_alumni.settings.javaScriptEnabled = true
        web_alumni.settings.allowContentAccess = true
        web_alumni.settings.useWideViewPort = true
        web_alumni.settings.domStorageEnabled = true
    }
}