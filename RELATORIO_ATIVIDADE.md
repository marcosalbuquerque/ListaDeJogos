# Relatório — Pesquisa e Projeto Prático em Kotlin Android

## 1. Identificação da Atividade
- **Tema:** Implementação de conceitos fundamentais no desenvolvimento Android com Kotlin  
- **Aplicativo desenvolvido:** **Lista de Jogos**

## 2. Proposta do Aplicativo
O aplicativo **Lista de Jogos** organiza jogos cadastrados em uma lista e exibe um resumo geral.  
Ele foi construído para demonstrar, na prática, os conceitos solicitados: Bottom Navigation, data class, entidade, RecyclerView, Fragment e ciclo de vida.

## 3. Conceitos Pesquisados e Explicados

### 3.1 Bottom Navigation
A **Bottom Navigation** é um componente de navegação na parte inferior da tela que permite alternar rapidamente entre áreas principais do app.  
No projeto, ela é usada na `MainActivity` para trocar entre os Fragments **Jogos** e **Sobre**.

### 3.2 Classe de dados em Kotlin (data class)
Uma **data class** é uma classe focada em armazenar dados.  
Ela reduz código repetitivo, pois o Kotlin gera automaticamente métodos como `toString()`, `equals()`, `hashCode()` e `copy()`.  
No projeto, a data class é:
- `Jogo` (`app/src/main/java/com/albuquerque/listadejogos/data/Jogo.kt`)

### 3.3 Entidade
Uma **entidade** representa um objeto do domínio do sistema (ex.: jogo, aluno, tarefa).  
No contexto Android, também pode representar dados para persistência (ex.: banco de dados).  
No projeto, a entidade é:
- `JogoEntity` (`app/src/main/java/com/albuquerque/listadejogos/data/JogoEntity.kt`)

### 3.4 RecyclerView
A **RecyclerView** é usada para exibir listas de forma eficiente, reaproveitando componentes visuais (itens).  
Ela funciona com três partes:
1. **Lista de dados** (objetos de jogo)
2. **Adapter** (faz ligação entre dados e interface)
3. **Layout do item** (visual de cada linha)

No projeto:
- RecyclerView: `fragment_lista_jogos.xml`
- Adapter: `JogoAdapter.kt`
- Item da lista: `item_jogo.xml`

### 3.5 Fragment
**Fragment** é uma parte reutilizável da interface dentro de uma Activity.  
Ele melhora a organização das telas e facilita manutenção.

No projeto foram criados dois Fragments:
- `ListaJogosFragment` (tela de lista de jogos)
- `SobreFragment` (tela de resumo e explicação dos conceitos)

### 3.6 Ciclo de vida (Activity/Fragment)
O ciclo de vida representa os estados de execução das telas.
Foram demonstrados os métodos:
- `onCreate`
- `onStart`
- `onResume`
- `onPause`
- `onStop`
- `onDestroy` (e `onDestroyView` nos Fragments)

A demonstração foi feita por **logs** (`Log.d`) em:
- `MainActivity`
- `ListaJogosFragment`
- `SobreFragment`

## 4. Requisitos do Projeto e Evidências

| Requisito | Implementação no projeto |
|---|---|
| App em Kotlin | Projeto Android em Kotlin |
| Bottom Navigation | `activity_main.xml` + `menu_bottom_navigation.xml` + lógica em `MainActivity.kt` |
| Pelo menos 2 Fragments | `ListaJogosFragment.kt` e `SobreFragment.kt` |
| Lista com RecyclerView | `fragment_lista_jogos.xml` + `JogoAdapter.kt` + `item_jogo.xml` |
| Classe de dados | `Jogo.kt` (`data class`) |
| Entidade | `JogoEntity.kt` |
| Ciclo de vida demonstrado | Logs de lifecycle na Activity e nos Fragments |
| App executando corretamente | Compila e abre com navegação entre telas e lista renderizada |

## 5. Onde cada item aparece no app (para falar no vídeo)
- **Proposta do app:** organização de jogos e resumo geral.
- **Bottom Navigation:** parte inferior, alternando entre **Jogos** e **Sobre**.
- **Fragments criados:** `ListaJogosFragment` e `SobreFragment`.
- **RecyclerView:** tela **Jogos**, mostrando a lista de jogos.
- **Data class:** `Jogo`.
- **Entidade:** `JogoEntity`.
- **Ciclo de vida:** logs no Logcat ao abrir, trocar de tela, minimizar e fechar o app.
- **App em execução:** demonstrar navegação, lista e tela de resumo.

## 6. Links de Entrega
- **Link do vídeo no YouTube (máx. 3 min):** `COLE_AQUI`
- **Link do repositório no GitHub:** `COLE_AQUI`

## 7. Conclusão
O projeto **Lista de Jogos** atende aos requisitos da atividade e demonstra de forma integrada os conceitos fundamentais solicitados no desenvolvimento Android com Kotlin.
