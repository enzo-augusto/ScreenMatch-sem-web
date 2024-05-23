package br.com.alura.screenmatch;

import br.com.alura.models.DadosSerie;
import br.com.alura.service.ConsumoAPI;
import br.com.alura.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		ConsumoAPI consumoAPI = new ConsumoAPI();
		String dados = consumoAPI
				.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=90c4e57a");

		ConverteDados conversor = new ConverteDados();
		DadosSerie dadosString =conversor.obterDados(dados, DadosSerie.class);
		System.out.println(dadosString);



	}
}
