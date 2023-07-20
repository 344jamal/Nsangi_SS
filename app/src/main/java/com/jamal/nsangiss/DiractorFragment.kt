package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class DiractorFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_diractor, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_director:WebView = view.findViewById(R.id.web_directors)
        web_director.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
               url:String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_director.loadUrl("https://nsangisecondaryschool.com/dos.html")
        web_director.settings.javaScriptEnabled = true
        web_director.settings.allowContentAccess = true
        web_director.settings.useWideViewPort = true
        web_director.settings.domStorageEnabled = true
    }
}