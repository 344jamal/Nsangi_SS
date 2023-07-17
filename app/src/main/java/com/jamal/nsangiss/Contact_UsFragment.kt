package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient


class Contact_UsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact__us, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val web_contact:WebView = view.findViewById(R.id.web_contact)
        web_contact.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url:String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_contact.loadUrl("https://nsangisecondaryschool.com/contact.html")
        web_contact.settings.javaScriptEnabled = true
        web_contact.settings.allowContentAccess = true
        web_contact.settings.useWideViewPort = true
        web_contact.settings.domStorageEnabled = true

    }

}