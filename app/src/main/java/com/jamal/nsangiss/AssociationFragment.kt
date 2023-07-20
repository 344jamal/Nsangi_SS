package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class AssociationFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_association, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_association:WebView = view.findViewById(R.id.web_association)
        web_association.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url:String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_association.loadUrl("https://nsangisecondaryschool.com/assoc.html")
        web_association.settings.javaScriptEnabled = true
        web_association.settings.allowContentAccess = true
        web_association.settings.useWideViewPort = true
        web_association.settings.domStorageEnabled = true
    }
}