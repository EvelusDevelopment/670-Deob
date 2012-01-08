import jaclib.memory.Buffer;

final class upa {

   static int a;
   static int b;
   static int d;
   static int c;


   static final void a(String var0, int var1) {
      ++c;
      if(ra.h && -1 != ~(24 & kd.c)) {
         boolean var2 = false;
         int var3 = ofa.b;
         int var5 = 70 % ((var1 - 13) / 52);
         int[] var4 = ot.a;

         for(int var6 = 0; var6 < var3; ++var6) {
            Object[] var7 = vo.E[var4[var6]];
            if(null != var7[37] && ((String)var7[37]).equalsIgnoreCase(var0) && (uta.g == var7 && (16 & kd.c) != 0 || -1 != ~(8 & kd.c))) {
               ++qg.a;
               Object[] var8 = ona.a((byte)124, (Object[])((Object[])lba.f[7]), sfa.b);
               ij.a(lca.d, (byte)126, (Object[])((Object[])var8[0]));
               if(null != var8 && var8.length == 18 && var8[6].equals(Integer.valueOf(0)) && var8[6].equals(Boolean.valueOf(false))) {
                  mr.f = true;
               }

               ek.putByte((Object[])((Object[])var8[0]), 0);
               op.putInt((Object[])((Object[])var8[0]), ft.f_i);
               eda.putShort((Object[])((Object[])var8[0]), var4[var6]);
               ij.a(rw.A, (byte)126, (Object[])((Object[])var8[0]));
               lj.a(var8, 6, lba.f);
               var2 = true;
               mw.a(gn.a(var7, (byte)76), -2, true, true, 0, 0, ((int[])((int[])var7[14]))[0], gn.a(var7, (byte)-109), ((int[])((int[])var7[33]))[0]);
               break;
            }
         }

         if(!var2) {
            kaa.a(gj.a(dp.y, -50, gj.f_mb) + var0, -94, 4);
         }

         if(ra.h) {
            rba.a((byte)99);
         }

      }
   }

   static final Object[] a(Object[] var0, int var1, int var2, Buffer var3, Object[] var4) {
      if(var4[1] == null) {
         var4[1] = new int[1];
      }

      ++b;
      if(var1 != 8) {
         return (Object[])null;
      } else {
         bua var6 = new bua(var4, var0, var3);
         var4[0] = var6;
         ((int[])((int[])var4[1]))[0] = var2;
         return var4;
      }
   }

   static final boolean a(Object[] var0, byte var1) {
      ++a;
      return var1 > -72?true:var0[7] == ((Object[])((Object[])var0[8]))[82];
   }

   static final Object[] a(int var0, ta var1, int var2) {
      if(var2 >= -107) {
         return (Object[])null;
      } else {
         ++d;
         Object[] var3 = vb.a(true, true, var0, false, var1);
         return null != var3?(Object[])((Object[])var3[0]):null;
      }
   }

}
