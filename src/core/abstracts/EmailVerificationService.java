package core.abstracts;

import entities.concretes.User;

public interface EmailVerificationService {

		boolean emailVerification (User user);
}
