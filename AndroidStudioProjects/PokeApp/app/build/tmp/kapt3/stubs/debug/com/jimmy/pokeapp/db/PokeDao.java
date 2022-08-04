package com.jimmy.pokeapp.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\n"}, d2 = {"Lcom/jimmy/pokeapp/db/PokeDao;", "", "addFavorites", "", "poke", "Lcom/jimmy/pokeapp/Pokemon;", "deleteFavorites", "getFavorites", "", "updateFavorites", "app_debug"})
public abstract interface PokeDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addFavorites(@org.jetbrains.annotations.NotNull()
    com.jimmy.pokeapp.Pokemon poke);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * From Pokemon")
    public abstract java.util.List<com.jimmy.pokeapp.Pokemon> getFavorites();
    
    @androidx.room.Update()
    public abstract void updateFavorites(@org.jetbrains.annotations.NotNull()
    com.jimmy.pokeapp.Pokemon poke);
    
    @androidx.room.Delete()
    public abstract void deleteFavorites(@org.jetbrains.annotations.NotNull()
    com.jimmy.pokeapp.Pokemon poke);
}