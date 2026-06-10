package p4.probe;

import java.security.KeyStore;
import java.security.Provider;

final class CryptoProviderProbe {
  Provider getSignatureProvider() throws Exception {
    return KeyStore.getInstance(KeyStore.getDefaultType()).getProvider();
  }

  int order() {
    return 100;
  }
}
