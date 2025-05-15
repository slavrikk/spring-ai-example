package ru.ai.example.demo.controller

import org.springframework.ai.chat.client.ChatClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class RequestController(
    private val chatClient: ChatClient
) {

    @PostMapping("/ask")
    fun askQuestion(@RequestBody question: String): String? =
        chatClient.prompt()
            .user(question)
            .call()
            .content()
}