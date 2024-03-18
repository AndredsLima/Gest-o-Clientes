package Controllers;

import java.util.Collection;
import java.util.Hashtable;

import Models.Client;

// Classe responsável por gerenciar uma agenda de clientes
public class Agenda {
    // Hashtable para armazenar os clientes usando o CPF como chave
    private Hashtable<String, Client> tabelaHash = new Hashtable<>();
    private static Agenda instance;

    private Agenda() {

    }

    public static Agenda getInstance() {
        if (instance == null) {
            instance = new Agenda();
        }
        return instance;
    }

    // Método para pesquisar um cliente pelo CPF
    public Client pesquisarClient(String cpf) {
        Client client = tabelaHash.get(cpf);

        if (client == null) {
            return null;
        }

        return client;
    }

    // Método para adicionar um novo cliente à agenda
    public Boolean addclient(Client client) {
        // Verifica se o cliente já está na agenda usando o CPF como chave
        if (tabelaHash.containsKey(client.getCpf().get())) {
            System.out.println("ja tem mn");
            return false;
        }
        // Adiciona o cliente à agenda
        this.tabelaHash.put(client.getCpf().get(), client);
        return true;
    }

    // Método para excluir um cliente da agenda pelo nome
    public boolean deleteClient(String nome) {
        // Verifica se o nome do cliente é nulo ou não existe na agenda
        if (nome == null || !this.tabelaHash.containsKey(nome)) {
            return false;
        }
        // Remove o cliente da agenda
        tabelaHash.remove(nome);
        return true;
    }

    // Método para retornar todos os clientes da agenda
    public Collection<Client> allClients() {
        // Verifica se a agenda está vazia
        if (tabelaHash.isEmpty() || tabelaHash.size() == 0) {
            return null;
        }
        // Retorna uma coleção de todos os clientes da agenda
        return tabelaHash.values();
    }
}
