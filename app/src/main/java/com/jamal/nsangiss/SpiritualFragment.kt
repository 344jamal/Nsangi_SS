package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class SpiritualFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_spiritual, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_spiritual:WebView = view.findViewById(R.id.web_spiritual)
        web_spiritual.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url:String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_spiritual.loadUrl("https://nsangisecondaryschool.com/union.html")
        web_spiritual.settings.javaScriptEnabled = true
        web_spiritual.settings.allowContentAccess = true
        web_spiritual.settings.useWideViewPort = true
        web_spiritual.settings.domStorageEnabled
    }
}