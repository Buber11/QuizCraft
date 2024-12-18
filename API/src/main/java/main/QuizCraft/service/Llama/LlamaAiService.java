package main.QuizCraft.service.Llama;

import main.QuizCraft.response.Response;

public interface LlamaAiService {

    <T extends  Response> T generateQuiz(String prompt);
    <T extends  Response> T generateFlashcards(String prompt);
    <T extends  Response> T generateFillInTheBlanks(String prompt);
    <T extends  Response> T generateSummary(String prompt);
    <T extends  Response> T generateTranslateText(String prompt, String targetLanguage);
    <T extends  Response> T generateTrueFalseQuestions(String prompt);
}