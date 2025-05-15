package ru.ai.example.demo.config

import org.springframework.ai.chat.client.ChatClient
import org.springframework.ai.chat.model.ChatModel
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ChatClientConfig {

    @Bean
    fun chatClient(chatModel: ChatModel) = ChatClient.builder(chatModel).build()
}