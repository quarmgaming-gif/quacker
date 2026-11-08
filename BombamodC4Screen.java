package pl.bombamod.c4;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public final class BombamodC4Screen extends Screen {
    private boolean hudEnabled = true;
    private boolean visualsEnabled = false;
    private boolean utilityEnabled = false;

    public BombamodC4Screen() {
        super(Text.literal("Bombamod C4"));
    }

    @Override
    protected void init() {
        int buttonWidth = 190;
        int x = (this.width - buttonWidth) / 2;
        int y = this.height / 2 - 35;

        addDrawableChild(ButtonWidget.builder(moduleLabel("HUD", hudEnabled), button -> {
            hudEnabled = !hudEnabled;
            button.setMessage(moduleLabel("HUD", hudEnabled));
        }).dimensions(x, y, buttonWidth, 20).build());

        addDrawableChild(ButtonWidget.builder(moduleLabel("Visuals", visualsEnabled), button -> {
            visualsEnabled = !visualsEnabled;
            button.setMessage(moduleLabel("Visuals", visualsEnabled));
        }).dimensions(x, y + 26, buttonWidth, 20).build());

        addDrawableChild(ButtonWidget.builder(moduleLabel("Utilities", utilityEnabled), button -> {
            utilityEnabled = !utilityEnabled;
            button.setMessage(moduleLabel("Utilities", utilityEnabled));
        }).dimensions(x, y + 52, buttonWidth, 20).build());

        addDrawableChild(ButtonWidget.builder(Text.literal("Close"), button -> close())
                .dimensions(x, y + 88, buttonWidth, 20).build());
    }

    private static Text moduleLabel(String name, boolean enabled) {
        return Text.literal(name + ": " + (enabled ? "ON" : "OFF"));
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        context.fill(0, 0, width, height, 0x99070B14);
        context.fill(width / 2 - 125, height / 2 - 92, width / 2 + 125, height / 2 + 128, 0xEE151C2B);
        context.drawCenteredTextWithShadow(textRenderer, Text.literal("BOMBAMOD C4"), width / 2, height / 2 - 78, 0xFFFF5555);
        context.drawCenteredTextWithShadow(textRenderer, Text.literal("Client menu  •  Right Shift"), width / 2, height / 2 - 59, 0xFFB8C4D8);
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
