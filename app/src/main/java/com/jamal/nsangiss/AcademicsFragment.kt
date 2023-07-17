package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient


class AcademicsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_academics, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_academics:WebView = view.findViewById(R.id.web_academics)
        web_academics.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_academics.loadUrl("https://nsangisecondaryschool.com/academics.html")
        web_academics.settings.javaScriptEnabled = true
        web_academics.settings.allowContentAccess = true
        web_academics.settings.useWideViewPort = true
        web_academics.settings.domStorageEnabled = true
    }
}