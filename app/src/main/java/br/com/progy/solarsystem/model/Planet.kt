package br.com.progy.solarsystem.model

enum class Type {
    NORMAL {
        override fun toString(): String {
            return "Normal"
        }
   },
    DWARF {
        override fun toString(): String {
            return "Anão"
        }
    }
}

data class Planet (
    val name: String,
    val description: String,
    val type: Type
)

class PlanetBuilder {
    var name: String = ""
    var description: String = ""
    var type: Type = Type.NORMAL

    fun build() : Planet = Planet(name, description, type)
}

fun planet(block: PlanetBuilder.() -> Unit): Planet = PlanetBuilder().apply(block).build()

fun mockedPlanets() = listOf(
    planet {
        name = "Mercúrio"
        description = "Mercúrio é o primeiro planeta do sistema solar, a contar a partir da proximidade com o Sol, distando-se em apenas 57,9 milhões de quilômetros da estrela em média. Com um diâmetro de 4878 km, é o menor entre os planetas do nosso sistema solar e também o que realiza mais rapidamente o seu movimento de translação, executado a uma velocidade de aproximadamente 47,87 km/s, levando, assim, 88 dias para completar sua volta ao redor do sol."
        type = Type.NORMAL
    },
    planet {
        name = "Vênus"
        description = "Também chamado de Estrela Dalva, estrela da manhã, estrela da tarde e joia do céu, é considerado um planeta irmão da Terra. Isso decorre em virtude das similaridades de massa, densidade e volume entre ambos."
        type = Type.NORMAL
    },
    planet {
        name = "Terra"
        description = "Estima-se que nosso planeta tenha sido formado há, mais ou menos, 4,6 bilhões de anos. De lá pra cá, a Terra passou por constantes mudanças, algumas nítidas, outras bem longas e que os seres humanos não percebem. Tais mudanças podem ocorrer de fatores internos, como a energia do núcleo, ou fatores externos, como chuvas, processos erosivos, ação humana."
        type = Type.NORMAL
    },
    planet {
        name = "Marte"
        description = "Um mundo desértico e gelado, Marte é o quarto planeta do Sistema Solar e tem duas luas — Fobos e Deimos, respectivamente “medo” e “pânico” em grego. Assim como a Terra, também tem estações, calotas polares, vulcões e desfiladeiros, mas a possibilidade de existir água líquida em sua superfície ainda divide os cientistas."
        type = Type.NORMAL
    },
    planet {
        name = "Júpiter"
        description = "Quinto planeta a partir do Sol, situado entre Marte e Saturno, Júpiter é o maior planeta do sistema solar, com diâmetro de 142.984 quilômetros – caberiam mil planetas como a Terra em Júpiter. Sua atmosfera é composta principalmente de hidrogênio e hélio."
        type = Type.NORMAL
    },
    planet {
      name = "Saturno"
      description = "Saturno é o sexto planeta do Sistema Solar — contando-se a partir da distância do sol —, sendo mais conhecido pelos anéis que o circundam. Trata-se do segundo maior planeta desse sistema, atrás apenas de Júpiter, apresentando um diâmetro de 120 536 km, que é cerca de nove vezes maior que o diâmetro equatorial terrestre."
        type = Type.NORMAL
    },
    planet {
        name = "Urano"
        description = "O planeta Urano é o terceiro maior do Sistema Solar e está posicionado na sétima órbita a partir do Sol. Formado principalmente por gases e fluidos, Urano não possui uma superfície sólida como a Terra. Sua estrutura é composta, ainda, por sistemas de anéis que orbitam ao seu redor, os quais são menos brilhantes do que os de outros planetas, como Saturno. Ao todo, Urano possui 27 luas conhecidas. Apenas uma sonda espacial visitou o planeta, sendo a maior parte das descobertas ao seu respeito feita com o auxílio de telescópios."
        type = Type.NORMAL
    },
    planet {
        name = "Netuno"
        description = "Imagine um mundo extremamente escuro, frio e azul. Essas são algumas das características de Netuno, o último planeta de nosso Sistema Solar. Ao todo, a distância entre o planeta azul e o Sol é quase 30 vezes maior que a entre a estrela e a Terra. "
        type = Type.NORMAL
    },
    planet {
        name = "Ceres"
        description = "Ceres está mais próximo do que você pode imaginar. Ele se encontra no cinturão de asteroides que está entre Marte e Júpiter e é o maior objeto que se encontra nesta região, sendo o planeta anão mais próximo do Sol. Foi descoberto por um astrônomo que estava à procura de uma estrela e chegou a ser chamado de asteroide por muito tempo, mas ele é bem maior e diferente de um objeto desse tipo. Sua massa corresponde a 25% da massa total do cinturão em que se encontra."
        type = Type.DWARF
    },
    planet {
        name = "Haumea"
        description = "Haumea é o terceiro planeta anão mais próximo do Sol (após Ceres e Plutão). Ele é o objeto que possui a rotação mais rápida do nosso Sistema Solar, completando uma volta ao redor de si em apenas quatro horas. Em função dessa rotação rápida, ele assume uma forma oval, como vemos na imagem abaixo."
        type = Type.DWARF
    },
    planet {
      name = "Makemake"
      description = "Makemake é o planeta anão seguinte e também está localizado no cinturão de Kuiper. Ele é o segundo objeto mais brilhante do cinturão. Seu nome vem da deusa da fertilidade da mitologia Rapanui. Este planeta anão tem uma lua conhecida por MK 2."
        type = Type.DWARF
    },
    planet {
        name = "Éris"
        description = "O maior planeta anão é Plutão, mas Éris vem em seguida com um tamanho bem parecido, sendo um pouco menor que a nossa Lua. O nome Éris vem da deusa grega da discórdia, o que condiz com as muitas discussões que esse planeta anão gera sobre a definição de um planeta. Éris tem uma lua chamada Disnomia, que faz uma órbita quase circular ao seu redor. Dentre os planetas anões identificados, ele é o mais distante do Sol, e está tão longe que a luz do Sol demora mais de 9 horas para chegar até ele."
        type = Type.DWARF
    },
    planet {
        name = "Plutão"
        description = "Plutão é um planeta anão que orbita o nosso sistema solar. Ele está localizado em uma região desse sistema chamada de Cinturão de Kuiper, em uma zona muito afastada do sol e que, portanto, apresenta uma baixíssima influência desse astro. Sua descoberta aconteceu no ano de 1930 pelo astrônomo norte-americano Clyde Tombaugh, e o seu nome foi escolhido por uma garota de 11 anos em referência ao deus romano do submundo."
        type = Type.DWARF
    }
)