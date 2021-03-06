package com.elmakers.mine.bukkit.api.data;

import java.util.ArrayList;
import java.util.List;

import com.elmakers.mine.bukkit.api.block.UndoList;

/**
 * This class is a placeholder for the eventuality of having a DAO
 * for UndoQueue data.
 *
 * <p>The complexity in implementing this requires a stopgap solution.
 */
public class UndoData {
    private final List<UndoList> blockList;

    public UndoData() {
        this.blockList = new ArrayList<>();
    }

    public List<UndoList> getBlockList() {
        return blockList;
    }
}
