package io.github.lucunji.uusiaurinko.datagen.client;

import org.apache.commons.lang3.tuple.Pair;

/**
 * These entries cannot be auto-generated by {@link ModLanguageProvider} and thus need to be handwritten.
 * <p>
 * The language files in {@code src/main/resources/assets/<modid>/lang} cannot co-exist with those in
 * {@code src/generated/resources/assets/<modid>/lang}, otherwise there can be conflicts between language
 * files with the same name.
 * Hence the only feasible (and easy) way to store these handwritten entries is to hardcode the languages
 * in a Java file.
 */
public enum HardcodedLanguageEntries {
    ZH_CN("zh_cn",
            Pair.of("itemGroup.uusi-aurinko.defaults", "Uusi Aurinko"),
            Pair.of("tooltip.uusi-aurinko.shift_more", "§o更多信息：按下 <Shift>§r"),
            Pair.of("tooltip.uusi-aurinko.shift_less", "\n§7§o更少信息：松开 <Shift>§r"),

            Pair.of("item.uusi-aurinko.fire_stone.tooltip", "这块石头看似炽热，摸着只是暖意融融。\n似乎被握在手中时能提供火焰防护，但是留心你的易燃家具！"),
            Pair.of("item.uusi-aurinko.water_stone.tooltip", "这块石头坚硬却又水流汩汩。\n它散发的潮气能对怕火的生物造成伤害，熄灭身上的火焰并临时凝固岩浆。\n它甚至能让你在水下呼吸！"),
            Pair.of("item.uusi-aurinko.lightning_stone.tooltip", "这块石头让你感到自己充满了电力。\n握着它能让你免受电击。请不要在导体附近随意丢弃。"),
            Pair.of("item.uusi-aurinko.earth_stone.tooltip", "这块石头看起来亘古不衰。\n它周围的一切都快速化为泥土；稍稍挥动它大地便会崩裂。"),
            Pair.of("item.uusi-aurinko.poop_stone.tooltip", "这块神秘的螺旋形物体闻着恶臭，摸着温热。\n呕……"),
            Pair.of("item.uusi-aurinko.sun_seed.tooltip", "它发着光，充满希望。\n周围的尘土都因它的热量迅速崩裂。"),
            Pair.of("item.uusi-aurinko.sun_stone.tooltip", "太阳精华之结晶。\n周围的尘土在顷刻间被焚烧殆尽。"),
            Pair.of("item.uusi-aurinko.evil_eye.tooltip", "这个形似眼球的人工物恶毒地瞪着。\n放在额头上，它将助你看清一切。\n强烈的凝视也使你感到紧张疲惫……"),
            Pair.of("item.uusi-aurinko.moon.tooltip", "WIP\n这个小巧的天体有着强大的重力。\n万物都被它吸引，尤其是其它天体。"),
            Pair.of("item.uusi-aurinko.emerald_tablet.tooltip",
                    "一：寻找到太阳的种子，将它放在神殿的中间接受正午太阳的照射；\n" +
                            "二：快速给予红色的太阳结晶足够的爆炸；\n" +
                            "三：为初生的太阳献上足够多的活祭品；\n" +
                            "四：收集四种元素的结晶，投入太阳使其成长完全；\n" +
                            "五：等待新生的太阳完全升起。\n" +
                            "§4注：第五种元素会带来腐化，投入不完全的太阳会带来无法预料的后果。§r"),

            Pair.of("death.attack.uusi-aurinko.electricity", "%1$s感受到了贯穿身体的高压电流"),
            Pair.of("death.attack.uusi-aurinko.electricity.player", "%1$s在与%2$s的战斗中感受到了贯穿身体的高压电流"),
            Pair.of("death.attack.uusi-aurinko.sun_blaze", "%1$s被新日的烈焰化为灰烬"),
            Pair.of("death.attack.uusi-aurinko.sun_blaze.player", "%1$s在与%2$s的战斗中被新日的烈焰化为灰烬"),
            Pair.of("death.attack.uusi-aurinko.sun_fusion", "%1$s感受到了新日的核聚变能量"),
            Pair.of("death.attack.uusi-aurinko.sun_fusion.player", "%1$s在与%2$s的战斗中感受到了新日的核聚变能量"),

            Pair.of("advancements.uusi-aurinko.root.title", "Uusi Aurinko"),
            Pair.of("advancements.uusi-aurinko.root.description", "闪耀与毁灭之路"),
            Pair.of("advancements.uusi-aurinko.fire_stone.title", "掌中炽焱"),
            Pair.of("advancements.uusi-aurinko.fire_stone.description", "获得 Kiuaskivi"),
            Pair.of("advancements.uusi-aurinko.water_stone.title", "固态水。等等，这不是冰？！"),
            Pair.of("advancements.uusi-aurinko.lightning_stone.title", "ElectroBOOM"),
            Pair.of("advancements.uusi-aurinko.water_stone.description", "获得 Vuoksikivi"),
            Pair.of("advancements.uusi-aurinko.lightning_stone.description", "获得 Ukkoskivi"),
            Pair.of("advancements.uusi-aurinko.earth_stone.title", "大地在颤动"),
            Pair.of("advancements.uusi-aurinko.earth_stone.description", "获得 Tannerkivi"),
            Pair.of("advancements.uusi-aurinko.poop_stone.title", "呕——"),
            Pair.of("advancements.uusi-aurinko.poop_stone.description", "获得 Kakkakikkare"),
            Pair.of("advancements.uusi-aurinko.make_new_sun.title", "转变"),
            Pair.of("advancements.uusi-aurinko.make_new_sun.description", "造出新日"),
            Pair.of("advancements.uusi-aurinko.grow_new_sun.title", "血与火"),
            Pair.of("advancements.uusi-aurinko.grow_new_sun.description", "给新日献上足够的祭品"),
            Pair.of("advancements.uusi-aurinko.full_new_sun.title", "太阳照常升起"),
            Pair.of("advancements.uusi-aurinko.full_new_sun.description", "在主世界升起最大的金色新日"),
            Pair.of("advancements.uusi-aurinko.dark_new_sun.title", "腐坏"),
            Pair.of("advancements.uusi-aurinko.dark_new_sun.description", "让新日变成黑色"),
            Pair.of("advancements.uusi-aurinko.rise_dark_new_sun.title", "新秩序"),
            Pair.of("advancements.uusi-aurinko.rise_dark_new_sun.description", "在末地升起黑色新日"),

            Pair.of("config.uusi-aurinko.change_fluid_rendering", "流体方块的渲染效果改变了。按下 F3+T 使其生效。"),

            Pair.of("container.uusi-aurinko.item_pedestal", "物品底座")
    ),

    EN_US("en_us",
            Pair.of("itemGroup.uusi-aurinko.defaults", "Uusi Aurinko"),
            Pair.of("tooltip.uusi-aurinko.shift_more", "§oMore Info: Press <Shift>§r"),
            Pair.of("tooltip.uusi-aurinko.shift_less", "\n§7§oLess Info: Release <Shift>§r"),

            Pair.of("item.uusi-aurinko.fire_stone.tooltip", "This tiny rock looks most fiery, but when touched only a pleasant warmth can be felt.\nSeem to provide fire protection when held in hand, but be careful with your flammable furniture!"),
            Pair.of("item.uusi-aurinko.water_stone.tooltip", "This small rock is hard and solid, yet seems to be gushing with water.\nIt is wet enough to damage fire-sensitive creatures, extinguish fire on body and solidify lava temporary.\nIt even makes you breath under water!"),
            Pair.of("item.uusi-aurinko.lightning_stone.tooltip", "This small rock makes you feel very charged.\nHolding it can makes you survive from electric shock. Do not throw it away near conductors."),
            Pair.of("item.uusi-aurinko.earth_stone.tooltip", "It looks like it could stand the test of aeons.\nIt quickly turns everything around into soil; with only a slight swing it can make earth collapse."),
            Pair.of("item.uusi-aurinko.poop_stone.tooltip", "This mysterious spiral-shaped artefact smells horrible and feels warm to the touch.\nDisgusting..."),
            Pair.of("item.uusi-aurinko.sun_seed.tooltip", "It glows, full of promise.\nDust and dirt around burst into pieces quickly under its tremendous heat."),
            Pair.of("item.uusi-aurinko.sun_stone.tooltip", "The essence of the Sun, crystallized.\nDust and dirt around are burnt down within seconds."),
            Pair.of("item.uusi-aurinko.evil_eye.tooltip", "This eye-shaped artefact projects a malevolent glare.\nPut it on your forehead, it then reveals everything to you.\nExhausting to you is its intense gaze."),
            Pair.of("item.uusi-aurinko.moon.tooltip", "WIP\nThis tiny celestial object has a strong gravitational pull.\nIt attracts everything, especially other stars."),
            Pair.of("item.uusi-aurinko.emerald_tablet.tooltip",
                    "I: Find the solar seed, place it at the center of temple to receive the midday sunshine;\n" +
                            "II: Give enough explosion to the reddish solar cristal rapidly;\n" +
                            "III: Contribute enough sacrifice to the new sun;\n" +
                            "IV: Collect four crystallized elements and throw them into the new sun;\n" +
                            "V: Wait for the new sun to fully rise up.\n" +
                            "§4Warning: The fifth element brings corruption. Throwing it into the half-completed star may have unexpected consequence.§r"),

            Pair.of("death.attack.uusi-aurinko.electricity", "%1$s experienced high voltage pass through the body"),
            Pair.of("death.attack.uusi-aurinko.electricity.player", "%1$s experienced high voltage pass through the body whilst fighting %2$s"),
            Pair.of("death.attack.uusi-aurinko.sun_blaze", "%1$s was burnt into ash by the blaze the new sun"),
            Pair.of("death.attack.uusi-aurinko.sun_blaze.player", "%1$s was burnt into ash by the blaze of the new sun whilst fighting %2$s"),
            Pair.of("death.attack.uusi-aurinko.sun_fusion", "%1$s experienced the nuclear fusion energy inside the new sun"),
            Pair.of("death.attack.uusi-aurinko.sun_fusion.player", "%1$s experienced the nuclear fusion energy inside the new sun whilst fighting %2$s"),

            Pair.of("advancements.uusi-aurinko.root.title", "Uusi Aurinko"),
            Pair.of("advancements.uusi-aurinko.root.description", "The way to glory and destruction"),
            Pair.of("advancements.uusi-aurinko.fire_stone.title", "Flame in Hand"),
            Pair.of("advancements.uusi-aurinko.fire_stone.description", "Obtain a Kiuaskivi"),
            Pair.of("advancements.uusi-aurinko.water_stone.title", "Solid Water, but Not Ice"),
            Pair.of("advancements.uusi-aurinko.water_stone.description", "Obtain a Vuoksikivi"),
            Pair.of("advancements.uusi-aurinko.lightning_stone.title", "ElectroBOOM"),
            Pair.of("advancements.uusi-aurinko.lightning_stone.description", "Obtain a Ukkoskivi"),
            Pair.of("advancements.uusi-aurinko.earth_stone.title", "The Earth is Shaking"),
            Pair.of("advancements.uusi-aurinko.earth_stone.description", "Obtain a Tannerkivi"),
            Pair.of("advancements.uusi-aurinko.poop_stone.title", "Disgusting..."),
            Pair.of("advancements.uusi-aurinko.poop_stone.description", "Obtain a Kakkakikkare"),
            Pair.of("advancements.uusi-aurinko.make_new_sun.title", "Transmutation"),
            Pair.of("advancements.uusi-aurinko.make_new_sun.description", "Make a new sun"),
            Pair.of("advancements.uusi-aurinko.grow_new_sun.title", "Blood and Fire"),
            Pair.of("advancements.uusi-aurinko.grow_new_sun.description", "Contribute enough sacrifice to the new sun"),
            Pair.of("advancements.uusi-aurinko.full_new_sun.title", "The Sun Also Rises"),
            Pair.of("advancements.uusi-aurinko.full_new_sun.description", "Make the fullest golden new sun rise up in the Overworld"),
            Pair.of("advancements.uusi-aurinko.dark_new_sun.title", "Corruption"),
            Pair.of("advancements.uusi-aurinko.dark_new_sun.description", "Make the new sun turn dark"),
            Pair.of("advancements.uusi-aurinko.rise_dark_new_sun.title", "The New Order"),
            Pair.of("advancements.uusi-aurinko.rise_dark_new_sun.description", "Make the dark new sun rise up in the End"),

            Pair.of("config.uusi-aurinko.change_fluid_rendering", "The rendering effect of fluid blocks is changed. Press F3+T to take effect."),

            Pair.of("container.uusi-aurinko.item_pedestal", "Item Pedestal")
    );

    final String locale;
    final Pair<String, String>[] entries;

    @SafeVarargs
    HardcodedLanguageEntries(String locale, Pair<String, String>... entries) {
        this.locale = locale;
        this.entries = entries;
    }
}
