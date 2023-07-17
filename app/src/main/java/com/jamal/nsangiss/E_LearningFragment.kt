package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient


class E_LearningFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_e__learning, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_learning:WebView = view.findViewById(R.id.web_elearning)
        web_learning.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_learning.loadUrl("https://nsangisecondaryschool.com/tense_e-learning/html/class_view2.php")
        web_learning.settings.javaScriptEnabled = true
        web_learning.settings.allowContentAccess = true
        web_learning.settings.useWideViewPort = true
        web_learning.settings.domStorageEnabled = true
    }
}