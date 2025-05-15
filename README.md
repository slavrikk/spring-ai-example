# spring-ai-example
Scratch project for testing SpringAI with local Ollama LLM

## Setup
1. Install Ollama: https://ollama.ai/download
2. Pull the model: `ollama pull llama3.1`
3. Run the model: `ollama run llama3.1`
4. Run the app with environment parameters: `OLLAMA_BASE_URL=http://localhost:11434 OLLAMA_MODEL=llama3.1 ./mvnw spring-boot:run`
5. Test the app: `curl -X POST http://localhost:8080/api/ask \
     -H "Content-Type: application/json" \
     -d '"What is the capital of France?"'`

## Stack
* Kotlin
* Spring Boot 3.4.5
* Spring AI 1.0.0-M6
* Ollama