package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient


class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_home:WebView = view.findViewById(R.id.web_home)
       web_home.webViewClient = object : WebViewClient(){
           override fun shouldOverrideUrlLoading(
               view: WebView?,
               url:String
           ): Boolean {
               view?.loadUrl(url)
               return true
           }
       }
        web_home.loadUrl("https://nsangisecondaryschool.com/index.html")
        web_home.settings.javaScriptEnabled = true
        web_home.settings.allowContentAccess = true
        web_home.settings.useWideViewPort = true
        web_home.settings.domStorageEnabled
    }
}