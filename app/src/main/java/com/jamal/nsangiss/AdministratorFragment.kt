package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class AdministratorFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_administrator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_administrators:WebView = view.findViewById(R.id.web_administrators)
        web_administrators.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url:String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_administrators.loadUrl("https://nsangisecondaryschool.com/admin.html")
        web_administrators.settings.javaScriptEnabled = true
        web_administrators.settings.allowContentAccess = true
        web_administrators.settings.useWideViewPort = true
        web_administrators.settings.domStorageEnabled = true
    }
}