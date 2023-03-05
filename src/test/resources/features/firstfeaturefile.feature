@Google_Search
Feature: First feature file

  Background: Go to Google Page
    Given User goes to Google

  @Iphone
  Scenario: TC01_Google_Iphone_search

    When User searchs Iphone ın searchbox
    Then Assert the results contain Iphone
    And Close the application


    @Volvo
  Scenario: TC02_Google_Volvo_search

    When User searchs Volvo ın searchbox
    Then Verify the results contain Volvo
    And Close the application


    # 1. Her feature file, Feature: kelimesi ile başlamak zorundadğr
    # 2. Her bir file da, yani iz bit Feature: kullanilabilir
    # 3. Senaryo(TEST CASE) olU5turmak icin Scenario kelime" kullanilir
    # 4. Birden fazla Scenario: kullanilabilir
    # 5.Her bir adim kelimelerinden biriylç baslamalidir.
    # 6.Given -> Genelde ilk satirlarda, pre condition ştepleri icin kullanilir
    # 7.Then -> Genelde son sat İrlanda, verification stepleri icin kullanilir:
    # 8. Andı When -> Genelde ara adimlarda baglac olarak kullanilir
    # NOTE: Teknik olarak istenilen kelime istenilen step de kullanilabilir,
    # ama gnlam karmasasi olmamasŞ icin bu adimlaç takip edilir
    # 9. Belirli Scenario lari çalistirmak icin cucumber tags ler kullanilir
    # tag ler Fetuature, Scenario, Scerio Outline, Examples kelimeleri ile birlikte kullanilabilir
    # 10. Background: Her bir Scenario kelimesinden ONCE tek bir sefer calisir
    # 11.dryRun=faIse -> dryRun yokmuş gibi normal şekilde calisir. Yani tum adimlari tek tek browserda acar.
    # 12.dryRun=true -> Yeni bir STEP(adim) eklendiginde sadece tanimlanmamis step definitions lari oluşturmak icin kullaniliç
    # kullanilma sebebi zamandan tasarruftur.




