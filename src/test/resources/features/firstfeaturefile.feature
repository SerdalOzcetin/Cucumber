Feature: First feature file

  Scenario: TC01_Google_Iphone_search

    Given User goes to Google
    When User searchs Iphone ın searchbox
    Then Assert the results contain Iphone



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



