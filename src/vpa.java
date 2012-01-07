
final class vpa {

   static int a;
   static int b;
   static String c = null;
   static int d;


   static final boolean b(int var0, Object[] var1) throws oqa {
      ++d;
      if(null != var1 && var1.length == 36) {
         var1[23] = kt.a(var0 ^ 6493, (Object[])((Object[])var1[17]), "WorldMatrix");
         var1[26] = kt.a(-18810, (Object[])((Object[])var1[17]), "WVPMatrix");
         var1[33] = kt.a(-18810, (Object[])((Object[])var1[17]), "UGenerationPlane");
         var1[22] = kt.a(-18810, (Object[])((Object[])var1[17]), "VGenerationPlane");
         var1[35] = kt.a(var0 + 1707, (Object[])((Object[])var1[17]), "Time");
         var1[24] = kt.a(-18810, (Object[])((Object[])var1[17]), "billowSampler3D");
         boolean var2 = true;
         if(!((boolean[])((boolean[])((Object[])((Object[])var1[25]))[0]))[0]) {
            var1[31] = lca.a((Object[])((Object[])var1[17]), (byte)117, "Waterfall2D");
            an.a((Object[])((Object[])var1[31]), (Object[])((Object[])var1[17]), true);
         } else {
            var1[29] = lca.a((Object[])((Object[])var1[17]), (byte)117, "Waterfall3D");
            an.a((Object[])((Object[])var1[29]), (Object[])((Object[])var1[17]), true);
         }

         return var2;
      } else {
         if(var0 != -20517) {
            a(-105, (Object[])((Object[])var1[12]));
         }

         if(var1 != null && 47 == var1.length) {
            return lqa.a((byte)116, var1);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(int var0, int var1, int var2, Object[] var3, int var4) {
      if(var1 == -19707) {
         ++a;
         ((int[][])((int[][])var3[0]))[var4][var2] |= var0;
      }
   }

   static final int a(int var0, Object[] var1) {
      if(var0 != 29) {
         return -31;
      } else {
         ++b;
         if(se.a((Object[])((Object[])var1[0]), (byte)-122)) {
            return 2;
         } else {
            if(hqa.a((Object[])((Object[])((Object[])((Object[])var1[0]))[5]), var0 ^ -77)) {
               int var3 = bg.a(true, (Object[])((Object[])((Object[])((Object[])var1[0]))[5]));
               boolean var2 = 0 == var3 || 2 == var3;
               if(var2) {
                  return 1;
               }
            }

            return 0;
         }
      }
   }

}
