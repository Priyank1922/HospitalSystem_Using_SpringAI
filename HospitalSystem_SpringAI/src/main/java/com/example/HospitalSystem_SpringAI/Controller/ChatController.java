package com.example.HospitalSystem_SpringAI.Controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HospitalSystem_SpringAI.Tools.FetchPatientTool;

@RestController
public class ChatController {

	private final ChatClient chatClient;

	public ChatController(ChatClient.Builder builder, FetchPatientTool fetchPatientTool) {

		this.chatClient = builder.defaultTools(fetchPatientTool).build();
	}

	@GetMapping("/ai")
	public String chat(@RequestParam String message) {

		return chatClient.prompt().system("""
				You are an AI Hospital Assistant.

				Your responsibilities:
				- Help users with patient information.
				- Use available tools whenever patient data is requested.
				- Never make up patient information.
				- If no patient is found, clearly say that the patient is not registered.
				- When patient data is available, generate a short and professional summary.
				- Mention patient name, age, gender, disease, doctor and last visit date.
				- Keep responses concise and easy to understand.
				""").user(message).call().content();
	}
}