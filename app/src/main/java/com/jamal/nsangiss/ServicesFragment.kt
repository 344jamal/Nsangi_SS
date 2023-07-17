package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient


class ServicesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_services, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_services:WebView = view.findViewById(R.id.web_services)
        web_services.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url:String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_services.loadUrl("https://nsangisecondaryschool.com/services.html")
        web_services.settings.javaScriptEnabled = true
        web_services.settings.allowContentAccess = true
        web_services.settings.useWideViewPort = true
        web_services.settings.domStorageEnabled = true
    }
}