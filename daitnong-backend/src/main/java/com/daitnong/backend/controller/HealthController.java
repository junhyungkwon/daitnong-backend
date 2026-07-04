package com.daitnong.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "다있농 API 서버 정상 실행";
    }

    @GetMapping("/api/test")
    public Map<String, Object> test() {
        return Map.of(
                "success", true,
                "message", "API 연결 성공"
        );
    }
}