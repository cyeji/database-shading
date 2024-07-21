package com.yeji.databaseshading.configuration;

import groovy.util.logging.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
class JasyptConfigTest {

    private static final Logger log = LoggerFactory.getLogger(JasyptConfigTest.class);
    @Autowired
    private StringEncryptor jasyptEncryptor;

    @Test
    void custom_jasypt_test() {
        var encryptTarget = "test";
        String encrypted = jasyptEncryptor.encrypt(encryptTarget);
        log.info("encrypted: " + encrypted);

        String decrypted = jasyptEncryptor.decrypt(encrypted);
        log.info("decrypted: " + decrypted);

        assertEquals(encryptTarget, decrypted);
    }

}