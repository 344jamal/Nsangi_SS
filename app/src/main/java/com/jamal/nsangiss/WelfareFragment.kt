package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class WelfareFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welfare, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_welfare:WebView = view.findViewById(R.id.web_welfare)
        web_welfare.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url:String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_welfare.loadUrl("https://nsangisecondaryschool.com/security.html")
        web_welfare.settings.javaScriptEnabled = true
        web_welfare.settings.allowContentAccess = true
        web_welfare.settings.useWideViewPort = true
        web_welfare.settings.domStorageEnabled = true
    }
}