package view;

import java.util.Scanner;
import model.userClient;

public class RegisterUser {
	public RegisterUser() {
		// TODO Auto-generated constructor stub

		Scanner scan = new Scanner(System.in);

		String chosen;
		do {
			System.out.println("Bem vindo ao Sistema de cadastro de aluno");
			System.out.println("Você é aluno novo?");
			System.out.println("Se sim, responda 'S' caso não responda 'N'");

			chosen = scan.next();
			switch (chosen) {
			case "S":
				String emailUserForLogin = scan.next();
				String passwordUserForLogin = scan.next();
				//new userClient(passwordUserForLogin, emailUserForLogin);//acho que tem funciona no abstract factory

				break;
			case "N":
				System.out.println("Digite as informações abaixo para realizar o novo cadastro:");
				System.out.println("Nome completo");// colcoar um regex aqui
				String usernameComplete = scan.next();// nome completo
				String emailUser = scan.next();// email
				String passwordUser = scan.next();// senha até 14 ou +
				String cpfUser = scan.next();// CPF -> validar
				String addressUser = scan.next();// address

				//new userClient(usernameComplete, emailUserForRegister, passwordUserForRegister, addressUser);
				break;

			}

		} while (chosen.equals("Encerrar Sessão"));
		scan.close();

	}
}
