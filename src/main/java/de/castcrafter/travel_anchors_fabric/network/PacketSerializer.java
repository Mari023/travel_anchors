package de.castcrafter.travel_anchors_fabric.network;

import net.minecraft.network.PacketBuffer;

public interface PacketSerializer<T> {

    Class<T> messageClass();

    void encode(T msg, PacketBuffer buffer);

    T decode(PacketBuffer buffer);
}
