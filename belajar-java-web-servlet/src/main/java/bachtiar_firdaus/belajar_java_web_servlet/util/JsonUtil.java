package bachtiar_firdaus.belajar_java_web_servlet.util;

import tools.jackson.databind.ObjectMapper;

public class JsonUtil {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static ObjectMapper getObjectMapper() {
        return OBJECT_MAPPER;
    }
}
