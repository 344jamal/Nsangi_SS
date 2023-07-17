package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class About_UsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about__us, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_about: WebView = view.findViewById(R.id.web_about)
        web_about.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_about.loadUrl("https://nsangisecondaryschool.com/about.html")
        web_about.settings.allowContentAccess = true
        web_about.settings.useWideViewPort = true
        web_about.settings.domStorageEnabled = true
        web_about.settings.javaScriptEnabled = true
    }
}