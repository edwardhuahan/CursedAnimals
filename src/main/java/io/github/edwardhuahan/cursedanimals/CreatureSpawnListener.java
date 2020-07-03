package io.github.edwardhuahan.cursedanimals;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class CreatureSpawnListener implements Listener {

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.SHEEP) {
            Sheep s = (Sheep) event.getEntity();

            for (Entity e : s.getNearbyEntities(5,5,5)) {
                if (e.getType() == EntityType.PLAYER && s.getTarget() != null) {
                    s.setTarget((LivingEntity)e);
                }
            }
        }
    }
}
