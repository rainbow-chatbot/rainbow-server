package rainbow.secret

object SslConfig {
    const val Alias = "key123"
    const val Password = "key123"
}

// sudo keytool -importkeystore -srckeystore keystore.p12 -srcstoretype pkcs12 -destkeystore keystore.jks